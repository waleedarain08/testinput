/* eslint-disable no-unused-vars */
/* eslint-disable eol-last */
/* eslint-disable react-native/no-inline-styles */
/* eslint-disable prettier/prettier */
import React, {useEffect,useState} from 'react';
import {DeviceEventEmitter, View,Text} from 'react-native';

import TestInput from './TestInputNativeView';

const App = () => {
  const onPress = () => {
    console.log('We will invoke the native module here!');
  };

  const [input,setInput] = useState('');

  useEffect(() => {
    DeviceEventEmitter.addListener('custom_event', (e) => {
      console.log(e);
    });
  }, []);

  return (
    <View style={{ flex: 1}}>
      <TestInput style={{flex:1}}/>
      <Text style={{color:'red'}}>{input}</Text>
    </View>
  );
};

export default App;