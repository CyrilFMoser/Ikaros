package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], C]
case class CC_B(a: T_A[CC_A[Int], CC_A[Char]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], ((Boolean,Int),CC_A[Char])]
case class CC_C[D](a: (T_A[Int, (Byte,Boolean)],(Byte,CC_B)), b: Char, c: T_A[D, D]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], D]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}