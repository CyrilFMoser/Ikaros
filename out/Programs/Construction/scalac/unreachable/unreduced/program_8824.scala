package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Int) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: ((CC_B,CC_A),(CC_B,CC_A)), b: Int, c: CC_B) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, 12, _) => 2 
  case CC_C(_, _, _) => 3 
}
}