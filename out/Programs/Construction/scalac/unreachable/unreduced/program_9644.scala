package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Char,T_A[Char, Byte]), b: T_A[T_A[Boolean, Byte], T_A[Byte, Char]], c: T_A[(Boolean,Char), T_A[Int, Byte]]) extends T_A[T_A[Char, Byte], (T_A[Boolean, Boolean],T_A[Char, Char])]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (CC_A,(Boolean,Boolean))], b: CC_A, c: (T_A[CC_A, CC_A],T_A[CC_A, CC_A])) extends T_A[T_A[Char, Byte], (T_A[Boolean, Boolean],T_A[Char, Char])]
case class CC_C(a: CC_B, b: CC_B, c: CC_A) extends T_A[T_A[Char, Byte], (T_A[Boolean, Boolean],T_A[Char, Char])]

val v_a: T_A[T_A[Char, Byte], (T_A[Boolean, Boolean],T_A[Char, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _), (_,_))