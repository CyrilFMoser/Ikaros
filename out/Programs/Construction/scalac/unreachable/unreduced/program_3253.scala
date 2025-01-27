package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[T_A[Byte, Char], T_A[Int, Char]]]
case class CC_B(a: T_A[Int, Int], b: CC_A) extends T_A[Boolean, T_A[T_A[Byte, Char], T_A[Int, Char]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Char], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}