package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: (T_A[Boolean, Boolean],T_B[Int])) extends T_A[E, D]
case class CC_B[F, G](a: F) extends T_A[F, G]
case class CC_C(a: T_B[CC_B[Int, Byte]]) extends T_B[(CC_B[Boolean, Byte],CC_A[Char, Byte])]
case class CC_D(a: Int) extends T_B[(CC_B[Boolean, Byte],CC_A[Char, Byte])]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A((CC_B(_),_))