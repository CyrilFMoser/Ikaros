package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C) extends T_A[C, T_A[T_A[Boolean, Boolean], T_A[Int, Int]]]
case class CC_B() extends T_A[CC_A[CC_A[Int]], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]]
case class CC_C(a: T_A[CC_B, T_A[Boolean, Char]]) extends T_A[CC_A[CC_A[Int]], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]]

val v_a: T_A[CC_A[CC_A[Int]], T_A[T_A[Boolean, Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}