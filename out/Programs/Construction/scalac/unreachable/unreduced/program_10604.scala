package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_A[Char, Int],Char)) extends T_A[D, (T_A[Boolean, Char],T_B[Byte])]
case class CC_B[E](a: E, b: E) extends T_A[E, (T_A[Boolean, Char],T_B[Byte])]
case class CC_C(a: (T_A[Int, Byte],CC_B[Int])) extends T_B[T_B[CC_A[Byte]]]
case class CC_D(a: CC_C, b: CC_C, c: T_A[CC_A[CC_C], CC_B[(Byte,Byte)]]) extends T_B[T_B[CC_A[Byte]]]
case class CC_E(a: Byte) extends T_B[T_B[CC_A[Byte]]]

val v_a: T_A[Byte, (T_A[Boolean, Char],T_B[Byte])] = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
  case CC_A((_,_)) => 1 
  case CC_B(_, _) => 2 
}
}