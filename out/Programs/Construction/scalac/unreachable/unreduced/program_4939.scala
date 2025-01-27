package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Int],(Boolean,Int)), b: (T_A[Byte, Boolean],T_A[Boolean, Int])) extends T_A[Boolean, C]
case class CC_B[D](a: Boolean, b: T_A[Boolean, D], c: CC_A[D]) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),(_,_)), (_,CC_A(_, _))) => 0 
  case CC_A((CC_A(_, _),(_,_)), (_,CC_B(_, _, _))) => 1 
  case CC_A((CC_B(_, _, _),(_,_)), (_,CC_A(_, _))) => 2 
  case CC_A((CC_B(_, _, _),(_,_)), (_,CC_B(_, _, _))) => 3 
  case CC_B(_, CC_A((_,_), _), _) => 4 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), _) => 5 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), _) => 6 
}
}