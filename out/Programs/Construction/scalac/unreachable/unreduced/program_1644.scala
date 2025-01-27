package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: T_A[T_B[Byte]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: (T_B[(Char,Char)],T_B[CC_A])) extends T_A[T_B[T_B[Int]]]
case class CC_C[C](a: C) extends T_A[C]
case class CC_D(a: T_B[Int], b: T_B[Byte]) extends T_B[Byte]
case class CC_E(a: T_A[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _)) => 0 
  case CC_D(_, CC_E(_)) => 1 
  case CC_E(CC_C(_)) => 2 
}
}