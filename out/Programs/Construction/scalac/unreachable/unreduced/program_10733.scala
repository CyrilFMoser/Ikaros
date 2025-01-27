package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_B[T_B[Int, Char], T_A[Char]]]
case class CC_B(a: Boolean, b: T_B[Boolean, CC_A], c: CC_A) extends T_A[T_B[T_B[Int, Char], T_A[Char]]]
case class CC_C(a: CC_A, b: Boolean, c: CC_B) extends T_A[T_B[T_B[Int, Char], T_A[Char]]]
case class CC_D[D, E]() extends T_B[D, Int]
case class CC_E(a: CC_A, b: CC_C) extends T_B[T_A[CC_A], Int]
case class CC_F(a: CC_D[T_B[CC_C, Int], (CC_C,CC_C)], b: T_B[T_A[CC_A], Int], c: CC_C) extends T_B[T_A[CC_A], Int]

val v_a: T_B[T_A[CC_A], Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_), CC_C(_, _, _)) => 1 
  case CC_F(CC_D(), CC_D(), CC_C(CC_A(_), _, CC_B(_, _, _))) => 2 
  case CC_F(CC_D(), CC_E(_, _), CC_C(CC_A(_), _, CC_B(_, _, _))) => 3 
  case CC_F(CC_D(), CC_F(CC_D(), CC_D(), CC_C(_, _, _)), CC_C(CC_A(_), _, CC_B(_, _, _))) => 4 
  case CC_F(CC_D(), CC_F(CC_D(), CC_E(_, _), CC_C(_, _, _)), CC_C(CC_A(_), _, CC_B(_, _, _))) => 5 
}
}
// This is not matched: CC_F(CC_D(), CC_F(CC_D(), CC_F(_, _, _), CC_C(_, _, _)), CC_C(CC_A(_), _, CC_B(_, _, _)))