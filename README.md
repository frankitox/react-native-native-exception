# Native Exception

In React Native there are two types of exceptions:

- JS exceptions.
- Native exceptions.

This library exposes a function called `raiseNativeError` that can be
used to throw a Native exception:

```javascript
import NativeException from 'react-native-native-exception';

NativeException.raiseNativeError('Oops!');
```

# Installation

```bash
yarn add --dev react-native-native-exception
```

# Observations

This is just a rip off of
[rn-test-exception-handler](https://github.com/a7ul/rn-test-exception-handler)
but working with the latest React native version. It **only supports
Android**, as I can't currently test iOS code.
