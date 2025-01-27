package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, Byte]) extends T_A[T_A[T_A[Byte, Boolean], (Boolean,Byte)], T_A[T_A[Byte, Byte], T_A[Byte, Char]]]
case class CC_B(a: Int, b: ((CC_A,(Char,Int)),T_A[CC_A, CC_A])) extends T_A[T_A[T_A[Byte, Boolean], (Boolean,Byte)], T_A[T_A[Byte, Byte], T_A[Byte, Char]]]
case class CC_C(a: (CC_B,CC_A), b: (CC_B,CC_A)) extends T_A[T_A[T_A[Byte, Boolean], (Boolean,Byte)], T_A[T_A[Byte, Byte], T_A[Byte, Char]]]

val v_a: T_A[T_A[T_A[Byte, Boolean], (Boolean,Byte)], T_A[T_A[Byte, Byte], T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, ((_,_),_)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)