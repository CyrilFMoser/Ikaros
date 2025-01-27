package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Boolean, Byte]]) extends T_A[T_B[(Boolean,Byte), Boolean]]
case class CC_B[E, D](a: T_B[E, E], b: T_B[E, CC_A]) extends T_B[E, D]
case class CC_C[G, F, H](a: CC_A) extends T_B[F, G]
case class CC_D(a: T_B[T_B[CC_A, CC_A], CC_A]) extends T_B[T_A[CC_C[Boolean, CC_A, CC_A]], T_B[T_B[CC_A, CC_A], CC_A]]

val v_a: T_B[T_A[CC_C[Boolean, CC_A, CC_A]], T_B[T_B[CC_A, CC_A], CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_C(CC_A(_)), _) => 1 
  case CC_C(CC_A(_)) => 2 
  case CC_D(CC_B(CC_B(_, _), _)) => 3 
  case CC_D(CC_B(CC_C(_), _)) => 4 
  case CC_D(CC_C(_)) => 5 
}
}