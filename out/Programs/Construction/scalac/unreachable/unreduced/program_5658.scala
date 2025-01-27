package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: Char, b: CC_A[Boolean], c: (Char,CC_A[Boolean])) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: (T_B[CC_B, CC_B],T_B[Boolean, CC_B]), b: T_B[T_A[CC_B], Byte]) extends T_A[T_A[T_A[Byte]]]
case class CC_D(a: (Byte,CC_A[Int]), b: (Char,CC_B), c: T_A[(CC_B,Boolean)]) extends T_B[(Byte,Byte), CC_B]
case class CC_E[E]() extends T_B[E, CC_A[CC_B]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C((_,_), _) => 2 
}
}