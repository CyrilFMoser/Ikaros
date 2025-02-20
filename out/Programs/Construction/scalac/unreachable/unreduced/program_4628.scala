package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Byte]]) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_B(a: (Boolean,(Char,CC_A))) extends T_A[(T_A[Char],T_A[Boolean])]
case class CC_C() extends T_A[(T_A[Char],T_A[Boolean])]

val v_a: T_A[(T_A[Char],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((true,(_,_))) => 1 
  case CC_B((false,(_,_))) => 2 
  case CC_C() => 3 
}
}