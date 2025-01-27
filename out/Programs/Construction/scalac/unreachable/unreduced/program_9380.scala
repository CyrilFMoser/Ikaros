package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_A[Byte, Char], T_B[(Boolean,Char)]]]
case class CC_B[E, F]() extends T_A[E, T_A[T_A[Byte, Char], T_B[(Boolean,Char)]]]
case class CC_C[G](a: Boolean, b: (T_A[Char, Int],Boolean), c: T_B[G]) extends T_B[G]
case class CC_D[H](a: T_A[(Int,(Char,Char)), H], b: CC_C[H], c: H) extends T_B[H]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_C(_, (_,_), _), _) => 1 
}
}