package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[Byte], T_A[Byte, Byte]], b: CC_A[CC_A[(Char,Byte)]], c: CC_A[CC_A[Char]]) extends T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]]]
case class CC_C(a: CC_A[T_A[(Int,Int), (Int,Boolean)]], b: Boolean, c: (CC_B,CC_B)) extends T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]]]

val v_a: T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(), _, (CC_B(_, _, _),CC_B(_, _, _))) => 2 
}
}