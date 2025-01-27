package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_B[Int]]) extends T_A[Char]
case class CC_B[C](a: Char, b: (Char,T_B[CC_A])) extends T_A[C]
case class CC_C(a: T_A[T_B[CC_A]], b: T_A[Char], c: Char) extends T_A[Char]
case class CC_D(a: CC_B[T_A[CC_C]]) extends T_B[T_A[Char]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, (_,_))) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_, CC_B(_, _)), _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, CC_C(CC_B(_, _), _, _), _) => 4 
}
}