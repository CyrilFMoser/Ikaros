package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Int], T_A], b: T_B[T_B[T_A, Int], Byte], c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C](a: C, b: ((Byte,(Boolean,Int)),CC_A)) extends T_B[Boolean, C]
case class CC_E[D, E](a: E, b: T_B[Boolean, D], c: (CC_D[T_A],CC_B)) extends T_B[Boolean, D]
case class CC_F[F](a: CC_B) extends T_B[F, (T_B[T_A, CC_B],T_B[Boolean, CC_A])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_C(_)) => 2 
  case CC_C(CC_B(_)) => 3 
}
}
// This is not matched: CC_B(CC_B(_))