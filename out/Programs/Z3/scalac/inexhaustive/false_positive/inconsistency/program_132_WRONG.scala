package Program_31 

object Test {
sealed trait T_A[B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B() extends T_B[T_A]
case class CC_C() extends T_B[T_A[Byte]]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_A (T_B (T_A Byte Byte))
//      (CC_B (T_B (T_A Byte Byte)))
//      Wildcard
//      (T_A (Tuple Byte Int) (T_B (T_A Byte Byte))))