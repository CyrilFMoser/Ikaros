package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Boolean, ((Int,Char),T_B[Int])]
case class CC_B[D](a: D, b: T_A[T_B[D], D]) extends T_B[D]
case class CC_C[E](a: T_B[E], b: (T_B[CC_A],(CC_A,CC_A)), c: T_B[E]) extends T_B[E]
case class CC_D(a: CC_A, b: T_B[(CC_A,Int)], c: CC_A) extends T_B[(CC_A,Int)]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, (CC_B(_, _),(_,_)), CC_B(_, _)) => 1 
  case CC_C(_, (CC_B(_, _),(_,_)), CC_C(CC_B(_, _), _, CC_B(_, _))) => 2 
  case CC_C(_, (CC_B(_, _),(_,_)), CC_C(CC_C(_, _, _), _, CC_B(_, _))) => 3 
  case CC_C(_, (CC_B(_, _),(_,_)), CC_C(CC_B(_, _), _, CC_C(_, _, _))) => 4 
  case CC_C(_, (CC_B(_, _),(_,_)), CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 5 
  case CC_C(_, (CC_C(_, _, _),(_,_)), CC_B(_, _)) => 6 
  case CC_C(_, (CC_C(_, _, _),(_,_)), CC_C(CC_B(_, _), _, CC_B(_, _))) => 7 
  case CC_C(_, (CC_C(_, _, _),(_,_)), CC_C(CC_C(_, _, _), _, CC_B(_, _))) => 8 
  case CC_C(_, (CC_C(_, _, _),(_,_)), CC_C(CC_B(_, _), _, CC_C(_, _, _))) => 9 
  case CC_C(_, (CC_C(_, _, _),(_,_)), CC_C(CC_C(_, _, _), _, CC_C(_, _, _))) => 10 
}
}