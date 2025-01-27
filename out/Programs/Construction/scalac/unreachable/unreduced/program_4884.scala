package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Boolean, Char], T_B[Boolean, Boolean]]]
case class CC_B[D]() extends T_B[CC_A, D]
case class CC_C[E](a: T_B[Int, E], b: T_B[CC_A, E]) extends T_B[CC_A, E]
case class CC_D[F, G](a: ((CC_A,Char),CC_B[CC_A]), b: T_A[G]) extends T_B[F, G]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_C(_, CC_C(CC_D(_, _), CC_B())) => 2 
  case CC_C(_, CC_C(CC_D(_, _), CC_C(_, _))) => 3 
  case CC_C(_, CC_D((_,_), _)) => 4 
  case CC_D(_, _) => 5 
}
}
// This is not matched: CC_C(_, CC_C(CC_D(_, _), CC_D(_, _)))