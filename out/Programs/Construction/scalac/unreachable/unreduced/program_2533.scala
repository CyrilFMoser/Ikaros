package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Byte, Boolean], T_A[Byte, Char]], Byte]
case class CC_B[E](a: (Boolean,T_A[CC_A, CC_A])) extends T_B[E, Int]
case class CC_C[F, G](a: CC_B[G], b: F) extends T_B[F, Int]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, _) => 1 
}
}