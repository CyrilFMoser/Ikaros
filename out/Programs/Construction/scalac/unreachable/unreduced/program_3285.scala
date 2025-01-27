package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int) extends T_A[Int, C]
case class CC_B(a: T_A[T_A[Boolean, Int], T_A[Int, Char]], b: CC_A[T_A[Char, Byte]]) extends T_A[Int, T_A[CC_A[Int], T_A[Boolean, Char]]]
case class CC_C(a: Char) extends T_A[Int, T_A[CC_A[Int], T_A[Boolean, Char]]]

val v_a: T_A[Int, T_A[CC_A[Int], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}