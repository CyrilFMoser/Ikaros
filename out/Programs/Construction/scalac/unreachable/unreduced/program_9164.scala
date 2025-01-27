package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[Boolean, Int], CC_A[Byte, Char]], b: (CC_A[(Boolean,Int), Boolean],T_A[Boolean, Int])) extends T_A[T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]], T_A[T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]], T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]]]]

val v_a: T_A[T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]], T_A[T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]], T_A[CC_A[Boolean, Char], T_A[CC_A[Boolean, Char], CC_A[Boolean, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_B(_, (CC_A(_, _),_)) => 1 
}
}