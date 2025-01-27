package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Char],T_A[Int, Char]), b: Char) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[Char, CC_A[Int]], b: T_A[T_A[Byte, Byte], Byte]) extends T_A[T_A[(T_A[Boolean, Byte],T_A[Char, Char]), (T_A[Boolean, Byte],T_A[Char, Char])], (T_A[Boolean, Byte],T_A[Char, Char])]
case class CC_C(a: Byte) extends T_A[T_A[(T_A[Boolean, Byte],T_A[Char, Char]), (T_A[Boolean, Byte],T_A[Char, Char])], (T_A[Boolean, Byte],T_A[Char, Char])]

val v_a: T_A[T_A[(T_A[Boolean, Byte],T_A[Char, Char]), (T_A[Boolean, Byte],T_A[Char, Char])], (T_A[Boolean, Byte],T_A[Char, Char])] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_C(_) => 2 
}
}