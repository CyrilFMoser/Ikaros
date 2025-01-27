package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F](a: F, b: Int, c: Byte) extends T_A[F, Boolean]
case class CC_C(a: CC_A[T_A[Byte, Boolean], CC_B[Char]], b: T_A[(Int,Boolean), Boolean], c: T_B[Boolean]) extends T_B[(CC_B[Byte],T_B[Char])]
case class CC_D[G](a: T_A[G, G]) extends T_B[(CC_B[Byte],T_B[Char])]

val v_a: T_B[(CC_B[Byte],T_B[Char])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A(), _) => 0 
  case CC_C(CC_A(), CC_B((_,_), _, _), _) => 1 
  case CC_D(_) => 2 
}
}