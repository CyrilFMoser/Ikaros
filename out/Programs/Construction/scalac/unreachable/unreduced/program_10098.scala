package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[T_B[Char], T_A[Int, Boolean]], b: T_A[T_A[(Boolean,Int), Char], T_B[Int]], c: Boolean) extends T_A[T_A[T_A[Char, Int], Int], (Boolean,T_B[Char])]
case class CC_B[D](a: Boolean, b: D) extends T_B[D]
case class CC_C[E, F](a: T_A[F, F], b: T_B[E], c: CC_A) extends T_B[E]
case class CC_D[G](a: CC_C[G, G], b: G) extends T_B[T_B[Byte]]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_B(_, CC_A(_, _, _)), _) => 1 
  case CC_C(_, CC_C(_, CC_B(_, _), _), _) => 2 
  case CC_C(_, CC_C(_, CC_C(_, _, _), _), _) => 3 
}
}