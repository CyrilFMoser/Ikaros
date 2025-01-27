package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],T_A[Byte, Boolean]), b: T_A[C, Char], c: (Boolean,(Char,Int))) extends T_A[C, Char]
case class CC_B() extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], Char]
case class CC_C(a: T_A[T_A[Byte, Char], CC_B], b: CC_B) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], Char]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Boolean, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}