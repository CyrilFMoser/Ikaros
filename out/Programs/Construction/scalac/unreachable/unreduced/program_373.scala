package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, (T_A[Boolean, Byte],Boolean)]
case class CC_B[E](a: (Int,CC_A[Char, Boolean]), b: T_A[E, E]) extends T_A[E, (T_A[Boolean, Byte],Boolean)]

val v_a: T_A[Boolean, (T_A[Boolean, Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _) => 1 
}
}