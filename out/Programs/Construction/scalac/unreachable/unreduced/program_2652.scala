package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, (Char,Char)], b: T_A[C, Int], c: C) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Int]], D]
case class CC_C(a: T_A[CC_B[Int], Char]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Int]], CC_A[CC_B[Char]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Int]], CC_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}