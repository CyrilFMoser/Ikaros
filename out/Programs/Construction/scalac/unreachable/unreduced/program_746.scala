package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: D) extends T_A[E, D]
case class CC_B[G, F](a: T_A[G, F], b: (T_A[Int, Char],(Int,Boolean)), c: F) extends T_A[F, G]
case class CC_C(a: T_B[(Int,Boolean)], b: T_A[T_A[Byte, (Char,Boolean)], T_A[Boolean, Byte]]) extends T_B[Byte]
case class CC_D(a: T_A[T_B[CC_C], CC_C]) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _)) => 0 
  case CC_C(_, CC_B(_, _, _)) => 1 
  case CC_D(CC_A(_, _)) => 2 
  case CC_D(CC_B(_, _, _)) => 3 
  case CC_E() => 4 
}
}