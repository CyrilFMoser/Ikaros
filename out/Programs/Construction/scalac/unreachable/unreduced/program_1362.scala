package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,Boolean)) extends T_A
case class CC_B[C](a: (T_A,(CC_A,T_A)), b: (T_B[(Int,Byte), (Boolean,Boolean)],(T_A,CC_A)), c: CC_A) extends T_B[C, T_B[T_A, T_B[Boolean, CC_A]]]
case class CC_C[D](a: Int, b: D, c: D) extends T_B[D, T_B[T_A, T_B[Boolean, CC_A]]]
case class CC_D[E](a: E, b: CC_C[Char], c: E) extends T_B[E, T_B[T_A, T_B[Boolean, CC_A]]]

val v_a: T_B[Boolean, T_B[T_A, T_B[Boolean, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), (_,_), _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}