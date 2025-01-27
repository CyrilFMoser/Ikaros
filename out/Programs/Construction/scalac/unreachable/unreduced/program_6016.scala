package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: (T_B[Char],T_B[Char])) extends T_A[(T_A[Boolean],T_B[Byte])]
case class CC_B() extends T_A[(T_A[Boolean],T_B[Byte])]
case class CC_C(a: CC_A, b: T_B[T_B[CC_A]], c: CC_A) extends T_A[(T_A[Boolean],T_B[Byte])]
case class CC_D[C](a: (CC_C,T_B[Boolean]), b: CC_C, c: T_A[C]) extends T_B[C]

val v_a: T_A[(T_A[Boolean],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D((_,_), CC_C(_, _, _), _), (CC_D(_, _, _),CC_D(_, _, _))) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)