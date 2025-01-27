package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Int, c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: ((Boolean,CC_A),T_A[CC_A]), c: (T_A[CC_A],T_A[Byte])) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C()), _, CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 4 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C()), _, CC_A(CC_A(_, _, _), _, _)) => 5 
  case CC_A(CC_A(CC_C(), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 6 
  case CC_A(CC_A(CC_C(), _, CC_B(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 7 
  case CC_A(CC_A(CC_C(), _, CC_C()), _, CC_A(CC_A(_, _, _), _, _)) => 8 
  case CC_A(CC_B(_, _, _), _, CC_A(CC_A(_, _, _), _, _)) => 9 
  case CC_A(CC_C(), _, CC_A(CC_A(_, _, _), _, _)) => 10 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 11 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 12 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C()), _, CC_A(CC_B(_, _, _), _, _)) => 13 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 14 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 15 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C()), _, CC_A(CC_B(_, _, _), _, _)) => 16 
  case CC_A(CC_A(CC_C(), _, CC_A(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 17 
  case CC_A(CC_A(CC_C(), _, CC_B(_, _, _)), _, CC_A(CC_B(_, _, _), _, _)) => 18 
  case CC_A(CC_A(CC_C(), _, CC_C()), _, CC_A(CC_B(_, _, _), _, _)) => 19 
  case CC_A(CC_B(_, _, _), _, CC_A(CC_B(_, _, _), _, _)) => 20 
  case CC_A(CC_C(), _, CC_A(CC_B(_, _, _), _, _)) => 21 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_C(), _, _)) => 22 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_C(), _, _)) => 23 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C()), _, CC_A(CC_C(), _, _)) => 24 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_C(), _, _)) => 25 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A(CC_C(), _, _)) => 26 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C()), _, CC_A(CC_C(), _, _)) => 27 
  case CC_A(CC_A(CC_C(), _, CC_A(_, _, _)), _, CC_A(CC_C(), _, _)) => 28 
  case CC_A(CC_A(CC_C(), _, CC_B(_, _, _)), _, CC_A(CC_C(), _, _)) => 29 
  case CC_A(CC_A(CC_C(), _, CC_C()), _, CC_A(CC_C(), _, _)) => 30 
  case CC_A(CC_B(_, _, _), _, CC_A(CC_C(), _, _)) => 31 
  case CC_A(CC_C(), _, CC_A(CC_C(), _, _)) => 32 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 33 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 34 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C()), _, CC_B(_, _, _)) => 35 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 36 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 37 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C()), _, CC_B(_, _, _)) => 38 
  case CC_A(CC_A(CC_C(), _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 39 
  case CC_A(CC_A(CC_C(), _, CC_B(_, _, _)), _, CC_B(_, _, _)) => 40 
  case CC_A(CC_A(CC_C(), _, CC_C()), _, CC_B(_, _, _)) => 41 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 42 
  case CC_A(CC_C(), _, CC_B(_, _, _)) => 43 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_C()) => 44 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _, CC_C()) => 45 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_C()), _, CC_C()) => 46 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_C()) => 47 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_C()) => 48 
  case CC_A(CC_A(CC_B(_, _, _), _, CC_C()), _, CC_C()) => 49 
  case CC_A(CC_A(CC_C(), _, CC_A(_, _, _)), _, CC_C()) => 50 
  case CC_A(CC_A(CC_C(), _, CC_B(_, _, _)), _, CC_C()) => 51 
  case CC_A(CC_A(CC_C(), _, CC_C()), _, CC_C()) => 52 
  case CC_A(CC_B(_, _, _), _, CC_C()) => 53 
  case CC_A(CC_C(), _, CC_C()) => 54 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 55 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 56 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_C())) => 57 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 58 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 59 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_C())) => 60 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_C()), ((_,_),_), (_,CC_A(_, _, _))) => 61 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_C()), ((_,_),_), (_,CC_B(_, _, _))) => 62 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_C()), ((_,_),_), (_,CC_C())) => 63 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 64 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 65 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), ((_,_),_), (_,CC_C())) => 66 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 67 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 68 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), ((_,_),_), (_,CC_C())) => 69 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_C()), ((_,_),_), (_,CC_A(_, _, _))) => 70 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_C()), ((_,_),_), (_,CC_B(_, _, _))) => 71 
  case CC_B(CC_A(CC_B(_, _, _), _, CC_C()), ((_,_),_), (_,CC_C())) => 72 
  case CC_B(CC_A(CC_C(), _, CC_A(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 73 
  case CC_B(CC_A(CC_C(), _, CC_A(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 74 
  case CC_B(CC_A(CC_C(), _, CC_A(_, _, _)), ((_,_),_), (_,CC_C())) => 75 
  case CC_B(CC_A(CC_C(), _, CC_B(_, _, _)), ((_,_),_), (_,CC_A(_, _, _))) => 76 
  case CC_B(CC_A(CC_C(), _, CC_B(_, _, _)), ((_,_),_), (_,CC_B(_, _, _))) => 77 
  case CC_B(CC_A(CC_C(), _, CC_B(_, _, _)), ((_,_),_), (_,CC_C())) => 78 
  case CC_B(CC_A(CC_C(), _, CC_C()), ((_,_),_), (_,CC_A(_, _, _))) => 79 
  case CC_B(CC_A(CC_C(), _, CC_C()), ((_,_),_), (_,CC_B(_, _, _))) => 80 
  case CC_B(CC_A(CC_C(), _, CC_C()), ((_,_),_), (_,CC_C())) => 81 
  case CC_B(CC_B(CC_A(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_A(_, _, _))) => 82 
  case CC_B(CC_B(CC_A(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_B(_, _, _))) => 83 
  case CC_B(CC_B(CC_A(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_C())) => 84 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_A(_, _, _))) => 85 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_B(_, _, _))) => 86 
  case CC_B(CC_B(CC_B(_, _, _), (_,_), (_,_)), ((_,_),_), (_,CC_C())) => 87 
  case CC_B(CC_B(CC_C(), (_,_), (_,_)), ((_,_),_), (_,CC_A(_, _, _))) => 88 
  case CC_B(CC_B(CC_C(), (_,_), (_,_)), ((_,_),_), (_,CC_B(_, _, _))) => 89 
  case CC_B(CC_B(CC_C(), (_,_), (_,_)), ((_,_),_), (_,CC_C())) => 90 
  case CC_B(CC_C(), ((_,_),_), (_,CC_A(_, _, _))) => 91 
  case CC_B(CC_C(), ((_,_),_), (_,CC_B(_, _, _))) => 92 
  case CC_B(CC_C(), ((_,_),_), (_,CC_C())) => 93 
  case CC_C() => 94 
}
}