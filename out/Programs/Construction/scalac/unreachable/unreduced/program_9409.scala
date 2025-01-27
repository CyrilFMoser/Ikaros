package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],T_A[Boolean, Byte]), b: C) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[(Byte,CC_A[Char]), T_A[(Byte,CC_A[Char]), (Byte,CC_A[Char])]]
case class CC_C(a: (CC_A[CC_B],T_A[CC_B, (Byte,Boolean)]), b: T_A[CC_B, T_A[CC_B, CC_B]]) extends T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]], T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Char, Byte]]]]]

val v_a: T_A[(Byte,CC_A[Char]), T_A[(Byte,CC_A[Char]), (Byte,CC_A[Char])]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), (_,CC_A(_, _))) => 0 
  case CC_B() => 1 
}
}