package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Boolean, Char]]]
case class CC_B(a: (CC_A[Byte],T_A[(Boolean,Char), Int]), b: CC_A[T_A[Byte, Boolean]], c: T_A[T_A[Int, Boolean], T_A[Int, Char]]) extends T_A[CC_A[T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Boolean, Char]]]
case class CC_C(a: CC_A[Boolean], b: CC_A[(Boolean,CC_B)], c: CC_B) extends T_A[CC_A[T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Boolean, Char]]]

val v_a: T_A[CC_A[T_A[Int, Byte]], T_A[T_A[Byte, Byte], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),_), CC_A(_), _) => 1 
}
}
// This is not matched: CC_C(_, _, CC_B(_, _, _))