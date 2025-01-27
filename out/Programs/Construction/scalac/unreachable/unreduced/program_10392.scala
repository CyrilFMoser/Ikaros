package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C]() extends T_B[C, T_B[T_A, CC_A]]
case class CC_C[D](a: (T_B[T_A, CC_A],T_B[T_A, T_A]), b: (Boolean,T_B[CC_A, (Int,Boolean)])) extends T_B[CC_A, D]

val v_a: T_B[CC_A, T_B[T_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_), _) => 1 
}
}