package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, Char], (T_A[(Int,Boolean), Int],Boolean)]
case class CC_B(a: T_A[CC_A[(Char,Boolean)], T_A[Boolean, Byte]], b: T_A[T_A[Byte, (Char,Char)], CC_A[Boolean]], c: T_A[CC_A[Int], T_A[Char, Int]]) extends T_A[T_A[Char, Char], (T_A[(Int,Boolean), Int],Boolean)]

val v_a: T_A[T_A[Char, Char], (T_A[(Int,Boolean), Int],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}