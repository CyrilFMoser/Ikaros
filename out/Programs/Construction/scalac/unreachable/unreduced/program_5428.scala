package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, E], b: T_B[E, E], c: T_B[E, F]) extends T_A[E, F]
case class CC_B[G]() extends T_B[Boolean, G]
case class CC_C(a: CC_B[CC_A[Boolean, Int]], b: Char) extends T_B[Boolean, (T_B[Boolean, Byte],CC_A[Boolean, Char])]
case class CC_D(a: T_B[Boolean, CC_C], b: T_A[CC_C, Char], c: T_B[T_B[Boolean, CC_C], T_A[(Int,Int), CC_C]]) extends T_B[Boolean, (T_B[Boolean, Byte],CC_A[Boolean, Char])]

val v_a: T_B[Boolean, (T_B[Boolean, Byte],CC_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_B()