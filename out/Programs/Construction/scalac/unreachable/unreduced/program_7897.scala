package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, (Int,Boolean)]], T_A[T_A[Int, Int], T_A[Char, Char]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A, (Boolean,Int)], T_A[CC_A, CC_A]], c: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, (Int,Boolean)]], T_A[T_A[Int, Int], T_A[Char, Char]]]
case class CC_C[C](a: CC_A, b: Char, c: C) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Char, (Int,Boolean)]], T_A[T_A[Int, Int], T_A[Char, Char]]]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Char, (Int,Boolean)]], T_A[T_A[Int, Int], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}