package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, (Boolean,Boolean)]]) extends T_A[T_B[T_A[(Char,Byte)], T_A[Byte]]]
case class CC_B(a: T_A[Char], b: T_A[T_A[CC_A]], c: (CC_A,(Int,CC_A))) extends T_A[T_B[T_A[(Char,Byte)], T_A[Byte]]]
case class CC_C(a: (T_B[CC_A, CC_B],(CC_B,CC_B)), b: CC_A, c: CC_A) extends T_A[T_B[T_A[(Char,Byte)], T_A[Byte]]]

val v_a: T_A[T_B[T_A[(Char,Byte)], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, (CC_A(_),(_,_))) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)