package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: T_A[T_A[Char]], c: T_B[(Byte,Byte)]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: (Boolean,T_B[CC_A])) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: T_A[T_B[CC_A]]) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: C, b: CC_C) extends T_B[C]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B((true,CC_D(_, _))) => 0 
  case CC_B((false,CC_D(_, _))) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)