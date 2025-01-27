package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Char,Int)], b: T_B[Byte]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: (Char,T_A[Char]), b: (T_A[(Int,Char)],T_A[Char]), c: T_B[T_B[Byte]]) extends T_A[Char]
case class CC_D(a: CC_C, b: T_B[Byte]) extends T_B[Byte]
case class CC_E[C]() extends T_B[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_C(_, _, _), CC_D(_, _))) => 0 
  case CC_A(_, CC_D(CC_C(_, _, _), CC_E())) => 1 
  case CC_A(_, CC_E()) => 2 
  case CC_B() => 3 
  case CC_C((_,CC_A(_, _)), (_,CC_B()), CC_E()) => 4 
  case CC_C((_,CC_A(_, _)), (_,CC_C(_, _, _)), CC_E()) => 5 
  case CC_C((_,CC_B()), (_,CC_A(_, _)), CC_E()) => 6 
  case CC_C((_,CC_B()), (_,CC_B()), CC_E()) => 7 
  case CC_C((_,CC_B()), (_,CC_C(_, _, _)), CC_E()) => 8 
  case CC_C((_,CC_C(_, _, _)), (_,CC_A(_, _)), CC_E()) => 9 
  case CC_C((_,CC_C(_, _, _)), (_,CC_B()), CC_E()) => 10 
  case CC_C((_,CC_C(_, _, _)), (_,CC_C(_, _, _)), CC_E()) => 11 
}
}
// This is not matched: CC_C((_,CC_A(_, _)), (_,CC_A(_, _)), CC_E())