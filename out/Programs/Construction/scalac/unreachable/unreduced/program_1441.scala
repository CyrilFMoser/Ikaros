package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Boolean],T_A[Byte, Byte]), b: (T_A[Byte, Byte],T_A[(Byte,Boolean), Int])) extends T_A[C, T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]]
case class CC_B[D](a: (T_A[Byte, Int],CC_A[Char]), b: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: Int) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(_, _) => 1 
}
}