package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, Int], c: T_A[T_A[T_A[Boolean, Boolean], Int], Int]) extends T_A[C, Int]
case class CC_B(a: T_A[T_A[Char, Char], CC_A[Char]]) extends T_A[T_A[(Byte,Boolean), Int], Int]
case class CC_C(a: CC_B) extends T_A[T_A[(Byte,Boolean), Int], Int]

val v_a: T_A[T_A[(Byte,Boolean), Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)), CC_B(_), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 1 
  case CC_A(CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)), CC_C(CC_B(_)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_B(_) => 3 
  case CC_C(_) => 4 
}
}