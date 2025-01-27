package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Boolean, T_A[Int, T_A[Char, Int]]]
case class CC_B(a: T_A[T_A[CC_A, Int], T_A[CC_A, CC_A]], b: CC_A) extends T_A[Boolean, T_A[Int, T_A[Char, Int]]]

val v_a: T_A[Boolean, T_A[Int, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}