package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Char, Byte], T_B[Byte, (Boolean,Char)]]]
case class CC_B(a: (CC_A,T_B[CC_A, Boolean]), b: CC_A) extends T_A[T_B[T_B[Char, Byte], T_B[Byte, (Boolean,Char)]]]
case class CC_C(a: CC_A) extends T_A[T_B[T_B[Char, Byte], T_B[Byte, (Boolean,Char)]]]
case class CC_D() extends T_B[CC_A, (T_A[CC_C],CC_A)]

val v_a: T_A[T_B[T_B[Char, Byte], T_B[Byte, (Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), CC_A()) => 1 
}
}
// This is not matched: CC_C(CC_A())