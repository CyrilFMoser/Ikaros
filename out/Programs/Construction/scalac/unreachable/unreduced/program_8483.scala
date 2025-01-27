package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, (Boolean,Int)], T_A], b: T_B[T_B[T_A, T_A], T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C[C](a: C) extends T_B[T_B[C, CC_B], C]
case class CC_D[D](a: T_B[T_B[D, CC_B], D], b: T_A) extends T_B[T_B[D, CC_B], D]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_A(_, _))) => 0 
  case CC_D(CC_C(CC_B(_, _)), CC_A(_, _)) => 1 
  case CC_D(CC_D(_, CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_D(CC_D(_, CC_B(_, _)), CC_A(_, _)) => 3 
  case CC_D(CC_C(CC_B(_, _)), CC_B(_, _)) => 4 
  case CC_D(CC_D(_, CC_A(_, _)), CC_B(_, _)) => 5 
}
}
// This is not matched: CC_D(CC_D(_, CC_B(_, _)), CC_B(_, _))