package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Byte (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte)) (T_A Byte))