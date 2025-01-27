package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: E) extends T_A[E, T_B[T_B[Byte, Char], T_A[Byte, Int]]]
case class CC_B[F, G](a: (T_A[Char, Byte],(Char,Boolean)), b: Int) extends T_B[F, Byte]
case class CC_C[H]() extends T_B[H, Byte]
case class CC_D(a: Boolean) extends T_B[T_A[T_B[Int, Boolean], Char], Byte]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C() => 1 
}
}