package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Byte]), b: T_A[T_A[Boolean]], c: T_A[Char]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Byte, b: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: Boolean) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}