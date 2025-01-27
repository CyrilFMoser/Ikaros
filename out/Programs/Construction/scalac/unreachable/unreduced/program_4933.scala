package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_B[Boolean]], c: T_B[Int]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: Boolean) extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: CC_B, b: (Int,CC_A), c: T_A[T_B[CC_A]]) extends T_B[(T_A[CC_B],Int)]
case class CC_D[C, D](a: CC_B, b: CC_C) extends T_B[C]
case class CC_E(a: T_B[CC_A], b: CC_B, c: T_B[CC_A]) extends T_B[(T_A[CC_B],Int)]

val v_a: T_B[(T_A[CC_B],Int)] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,CC_A(_, _, _)), _) => 0 
  case CC_D(CC_B(_), CC_C(CC_B(_), (_,_), _)) => 1 
  case CC_E(CC_D(CC_B(_), _), CC_B(_), CC_D(_, _)) => 2 
}
}