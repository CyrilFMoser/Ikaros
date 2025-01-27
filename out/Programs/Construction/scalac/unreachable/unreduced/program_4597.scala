package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B(a: T_B[T_B[(Int,Boolean)]], b: T_B[CC_A[Char]], c: CC_A[T_A[Byte]]) extends T_B[T_A[T_A[Char]]]
case class CC_C(a: CC_B) extends T_B[T_A[T_A[Char]]]
case class CC_D(a: Byte, b: CC_A[(CC_B,CC_C)], c: (CC_A[CC_C],T_A[CC_B])) extends T_B[T_A[T_A[Char]]]

val v_a: T_B[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
  case CC_D(_, CC_A(_, (_,_)), (CC_A(_, _),CC_A(_, _))) => 2 
}
}